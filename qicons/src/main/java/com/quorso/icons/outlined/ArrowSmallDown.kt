package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowSmallDown: ImageVector
    get() {
        if (_ArrowSmallDown != null) {
            return _ArrowSmallDown!!
        }
        _ArrowSmallDown = ImageVector.Builder(
            name = "Outlined.ArrowSmallDown",
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
                moveTo(12f, 4.5f)
                verticalLineToRelative(15f)
                moveToRelative(0f, 0f)
                lineToRelative(6.75f, -6.75f)
                moveTo(12f, 19.5f)
                lineToRelative(-6.75f, -6.75f)
            }
        }.build()

        return _ArrowSmallDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSmallDown: ImageVector? = null
