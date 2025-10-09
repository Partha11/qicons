package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) {
            return _CloudArrowUp!!
        }
        _CloudArrowUp = ImageVector.Builder(
            name = "Outlined.CloudArrowUp",
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
                moveTo(12f, 16.5f)
                verticalLineTo(9.75f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, 3f)
                moveToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
                moveTo(6.75f, 19.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -8.775f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.233f, -2.33f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.758f, 3.848f)
                arcTo(3.752f, 3.752f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }.build()

        return _CloudArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowUp: ImageVector? = null
