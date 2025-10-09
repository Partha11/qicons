package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowsPointingOut: ImageVector
    get() {
        if (_ArrowsPointingOut != null) {
            return _ArrowsPointingOut!!
        }
        _ArrowsPointingOut = ImageVector.Builder(
            name = "Outlined.ArrowsPointingOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.75f, 3.75f)
                verticalLineToRelative(4.5f)
                moveToRelative(0f, -4.5f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-4.5f, 0f)
                lineTo(9f, 9f)
                moveTo(3.75f, 20.25f)
                verticalLineToRelative(-4.5f)
                moveToRelative(0f, 4.5f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-4.5f, 0f)
                lineTo(9f, 15f)
                moveTo(20.25f, 3.75f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(4.5f)
                moveToRelative(0f, -4.5f)
                lineTo(15f, 9f)
                moveToRelative(5.25f, 11.25f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(4.5f, 0f)
                verticalLineToRelative(-4.5f)
                moveToRelative(0f, 4.5f)
                lineTo(15f, 15f)
            }
        }.build()

        return _ArrowsPointingOut!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsPointingOut: ImageVector? = null
