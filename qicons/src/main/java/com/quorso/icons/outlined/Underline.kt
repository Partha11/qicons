package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Underline: ImageVector
    get() {
        if (_Underline != null) {
            return _Underline!!
        }
        _Underline = ImageVector.Builder(
            name = "Outlined.Underline",
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
                moveTo(17.995f, 3.744f)
                verticalLineToRelative(7.5f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 0f)
                verticalLineToRelative(-7.5f)
                moveToRelative(-2.25f, 16.502f)
                horizontalLineToRelative(16.5f)
            }
        }.build()

        return _Underline!!
    }

@Suppress("ObjectPropertyName")
private var _Underline: ImageVector? = null
