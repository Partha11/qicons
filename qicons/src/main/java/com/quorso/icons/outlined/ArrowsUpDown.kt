package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowsUpDown: ImageVector
    get() {
        if (_ArrowsUpDown != null) {
            return _ArrowsUpDown!!
        }
        _ArrowsUpDown = ImageVector.Builder(
            name = "Outlined.ArrowsUpDown",
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
                moveTo(3f, 7.5f)
                lineTo(7.5f, 3f)
                moveToRelative(0f, 0f)
                lineTo(12f, 7.5f)
                moveTo(7.5f, 3f)
                verticalLineToRelative(13.5f)
                moveToRelative(13.5f, 0f)
                lineTo(16.5f, 21f)
                moveToRelative(0f, 0f)
                lineTo(12f, 16.5f)
                moveToRelative(4.5f, 4.5f)
                verticalLineTo(7.5f)
            }
        }.build()

        return _ArrowsUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsUpDown: ImageVector? = null
