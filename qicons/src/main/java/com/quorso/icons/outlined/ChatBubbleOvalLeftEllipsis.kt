package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChatBubbleOvalLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleOvalLeftEllipsis != null) {
            return _ChatBubbleOvalLeftEllipsis!!
        }
        _ChatBubbleOvalLeftEllipsis = ImageVector.Builder(
            name = "Outlined.ChatBubbleOvalLeftEllipsis",
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
                moveTo(8.625f, 12f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(8.625f, 12f)
                lineTo(8.25f, 12f)
                moveToRelative(4.125f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(12.375f, 12f)
                lineTo(12f, 12f)
                moveToRelative(4.125f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(16.125f, 12f)
                horizontalLineToRelative(-0.375f)
                moveTo(21f, 12f)
                curveToRelative(0f, 4.556f, -4.03f, 8.25f, -9f, 8.25f)
                arcToRelative(9.764f, 9.764f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.555f, -0.337f)
                arcTo(5.972f, 5.972f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.41f, 20.97f)
                arcToRelative(5.969f, 5.969f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.474f, -0.065f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.978f, -2.025f)
                curveToRelative(0.09f, -0.457f, -0.133f, -0.901f, -0.467f, -1.226f)
                curveTo(3.93f, 16.178f, 3f, 14.189f, 3f, 12f)
                curveToRelative(0f, -4.556f, 4.03f, -8.25f, 9f, -8.25f)
                reflectiveCurveToRelative(9f, 3.694f, 9f, 8.25f)
                close()
            }
        }.build()

        return _ChatBubbleOvalLeftEllipsis!!
    }

@Suppress("ObjectPropertyName")
private var _ChatBubbleOvalLeftEllipsis: ImageVector? = null
